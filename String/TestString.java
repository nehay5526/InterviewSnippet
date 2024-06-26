package String;

public class TestString {
    public static void main(String... args){
        System.out.println( "with cte as (\n" +
        "   SELECT\n" +
        "\t\tusr.id AS userId,\n" +
        "        usr.username AS userName,\n" +
        "        usr.name AS name,\n" +
        "        usr.email AS emailId,\n" +
        "        usr.phone_no AS phoneNo,\n" +
        "        usr.role_alias AS roleAlias,\n" +
        "        usr.parent_id AS parentId,\n" +
        "        TRUNCATE(ad.balance, 2) AS availableDW,\n" +
        "        ad.exposure_limit AS exposureLimit,\n" +
        "        TRUNCATE(ad.exposure, 2) selfExposure,\n" +
        "        usr.account_locked AS accLocked,\n" +
        "        usr.account_expired AS accSuspended,\n" +
        "        usr.acc_suspended_by_owner AS accSuspendedByOwner,\n" +
        "        usr.enabled AS enabled,\n" +
        "        usr.status_updated_by AS statChngBy,\n" +
        "        ad.credit_ref AS creditRef,\n" +
        "        ad.currency AS currency,\n" +
        "        ad.rate AS rate,\n" +
        "        CASE\n" +
        "            WHEN SUBSTRING_INDEX(usr.level, :userIdLevel, - 1) LIKE '%/%' THEN SUBSTRING_INDEX(SUBSTRING_INDEX(usr.level, :userIdLevel, - 1), '/', 1)\n" +
        "            ELSE usr.id\n" +
        "        END AS gp\n" +
        "   FROM\n" +
        "        play_auth.users AS usr\n" +
        "   INNER JOIN play_auth.account_details AS ad ON ad.user_id = usr.id\n" +
        "   WHERE\n" +
        "        usr.level LIKE :level AND ad.currency = :currency\n" +
        "   )select a.*,\n" +
        "\tTRUNCATE(SUM(b.availableDW), 2) AS balance,\n" +
        "\t\ttruncate(SUM(b.availableDW)-a.availableDW,2) AS playerBalance,\n" +
        "\t\ttruncate(SUM(b.selfExposure),2) as exposure,\n" +
        "\t\ttruncate(SUM(b.availableDW) - a.creditRef,2) AS refPnL,\n" +
        "\t\ttruncate(SUM(b.availableDW)+SUM(b.selfExposure),2)  AS availBal," +
        "\t\tCASE\n" +
        "\t\t\twhen a.enabled then UPPER('a')\n" +
        "\t\t\twhen a.accSuspended and a.accLocked is false  then  UPPER('b')\n" +
        "\t\t\twhen a.accSuspended and a.accLocked then UPPER('c')\n" +
        "\t\t\telse  UPPER('d')\n" +
        "\t\tEnd as sortByStatus\n" +
        "\tfrom cte as a inner join cte as b on a.userId = b.gp group by b.gp\n" +
        "   ADD_STATUS\n" +
        "   ADD_USER\n" +
        "   SORT\n" +
        "   limit\n" +
        "   :offset, :size\n");
        // String s = "rdxfcvghbjnewudhjw";
        // char[] ch = s.toCharArray();
        // int length=0;
        // for(int i=0;;i++){
        //     ++length;try{
        //       System.out.println("length:::"+ch[i]);
        //     }catch(ArrayIndexOutOfBoundsException e){
        //         System.out.println("An error occurs::"+length);
        //         break;
        //     }
           
        // }
        // System.out.println("length:::"+length);
    }
}
