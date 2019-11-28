package cn.lmf.entity;

import java.util.HashMap;
import java.util.Map;

public class ErrorCodeMap {
    public static final Map<String, CCErrorCode> ERROR_CODE_MAP = new HashMap<>();

    static {
        ERROR_CODE_MAP.put("01000", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("01002", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("01003", CCErrorCode.ERR19999);

        ERROR_CODE_MAP.put("02000", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("02050", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("02060", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("02070", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("02080", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("02090", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("02091", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("02092", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("02093", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("02094", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("02095", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("02096", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("02099", CCErrorCode.ERR19999);

        ERROR_CODE_MAP.put("07000", CCErrorCode.ERR19002);
        ERROR_CODE_MAP.put("07010", CCErrorCode.ERR19003);
        ERROR_CODE_MAP.put("07020", CCErrorCode.ERR19004);
        ERROR_CODE_MAP.put("07030", CCErrorCode.ERR19005);
        ERROR_CODE_MAP.put("07040", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("07050", CCErrorCode.ERR19006);
        ERROR_CODE_MAP.put("07060", CCErrorCode.ERR13004);
        ERROR_CODE_MAP.put("07070", CCErrorCode.ERR12025);
        ERROR_CODE_MAP.put("07099", CCErrorCode.ERR19007);

        ERROR_CODE_MAP.put("08000", CCErrorCode.ERR19008);
        ERROR_CODE_MAP.put("08010", CCErrorCode.ERR19009);
        ERROR_CODE_MAP.put("08020", CCErrorCode.ERR19010);
        ERROR_CODE_MAP.put("08030", CCErrorCode.ERR19011);
        ERROR_CODE_MAP.put("08040", CCErrorCode.ERR19012);
        ERROR_CODE_MAP.put("08050", CCErrorCode.ERR13005);
        ERROR_CODE_MAP.put("08099", CCErrorCode.ERR19013);

        ERROR_CODE_MAP.put("09000", CCErrorCode.ERR13006);
        ERROR_CODE_MAP.put("09100", CCErrorCode.ERR13007);
        ERROR_CODE_MAP.put("09200", CCErrorCode.ERR19014);
        ERROR_CODE_MAP.put("09300", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("09999", CCErrorCode.ERR19015);

        ERROR_CODE_MAP.put("10000", CCErrorCode.ERR30005);
        ERROR_CODE_MAP.put("19900", CCErrorCode.ERR30006);

        ERROR_CODE_MAP.put("20000", CCErrorCode.ERR31005);
        ERROR_CODE_MAP.put("29900", CCErrorCode.ERR31006);

        ERROR_CODE_MAP.put("30000", CCErrorCode.ERR32009);
        ERROR_CODE_MAP.put("39900", CCErrorCode.ERR32010);

        ERROR_CODE_MAP.put("40000", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("40002", CCErrorCode.ERR14005);
        ERROR_CODE_MAP.put("40003", CCErrorCode.ERR14006);
        ERROR_CODE_MAP.put("40139", CCErrorCode.ERR10008);
        ERROR_CODE_MAP.put("40004", CCErrorCode.ERR11003);
        ERROR_CODE_MAP.put("40005", CCErrorCode.ERR14007);
        ERROR_CODE_MAP.put("40006", CCErrorCode.ERR12026);
        ERROR_CODE_MAP.put("40008", CCErrorCode.ERR11002);
        ERROR_CODE_MAP.put("40009", CCErrorCode.ERR11000);
        ERROR_CODE_MAP.put("40010", CCErrorCode.ERR11005);
        ERROR_CODE_MAP.put("40015", CCErrorCode.ERR12087);
        ERROR_CODE_MAP.put("40016", CCErrorCode.ERR11037);
        ERROR_CODE_MAP.put("40071", CCErrorCode.ERR11038);
        ERROR_CODE_MAP.put("40017", CCErrorCode.ERR12088);
        ERROR_CODE_MAP.put("40040", CCErrorCode.ERR11013);
        ERROR_CODE_MAP.put("40041", CCErrorCode.ERR11014);
        ERROR_CODE_MAP.put("40042", CCErrorCode.ERR11015);
        ERROR_CODE_MAP.put("40043", CCErrorCode.ERR11016);
        ERROR_CODE_MAP.put("40050", CCErrorCode.ERR14008);
        ERROR_CODE_MAP.put("40051", CCErrorCode.ERR14009);
        ERROR_CODE_MAP.put("40052", CCErrorCode.ERR11017);
        ERROR_CODE_MAP.put("40053", CCErrorCode.ERR12027);
        ERROR_CODE_MAP.put("40054", CCErrorCode.ERR12028);
        ERROR_CODE_MAP.put("40055", CCErrorCode.ERR12029);
        ERROR_CODE_MAP.put("40056", CCErrorCode.ERR12030);
        ERROR_CODE_MAP.put("40057", CCErrorCode.ERR12031);
        ERROR_CODE_MAP.put("40058", CCErrorCode.ERR12032);
        ERROR_CODE_MAP.put("40059", CCErrorCode.ERR12033);
        ERROR_CODE_MAP.put("40060", CCErrorCode.ERR12034);
        ERROR_CODE_MAP.put("40061", CCErrorCode.ERR12035);
        ERROR_CODE_MAP.put("40062", CCErrorCode.ERR12036);
        ERROR_CODE_MAP.put("40063", CCErrorCode.ERR12037);
        ERROR_CODE_MAP.put("40064", CCErrorCode.ERR12038);
        ERROR_CODE_MAP.put("40065", CCErrorCode.ERR12039);
        ERROR_CODE_MAP.put("40066", CCErrorCode.ERR12040);
        ERROR_CODE_MAP.put("40067", CCErrorCode.ERR12041);
        ERROR_CODE_MAP.put("40068", CCErrorCode.ERR12042);
        ERROR_CODE_MAP.put("40069", CCErrorCode.ERR12043);
        ERROR_CODE_MAP.put("40080", CCErrorCode.ERR12044);
        ERROR_CODE_MAP.put("40081", CCErrorCode.ERR12045);
        ERROR_CODE_MAP.put("40082", CCErrorCode.ERR12046);
        ERROR_CODE_MAP.put("40083", CCErrorCode.ERR12047);
        ERROR_CODE_MAP.put("40084", CCErrorCode.ERR12048);
        ERROR_CODE_MAP.put("40085", CCErrorCode.ERR11018);
        ERROR_CODE_MAP.put("40086", CCErrorCode.ERR12060);
        ERROR_CODE_MAP.put("40098", CCErrorCode.ERR12049);
        ERROR_CODE_MAP.put("40099", CCErrorCode.ERR12050);
        ERROR_CODE_MAP.put("40102", CCErrorCode.ERR12076);
        ERROR_CODE_MAP.put("40103", CCErrorCode.ERR12077);
        ERROR_CODE_MAP.put("40102", CCErrorCode.ERR11021);
        ERROR_CODE_MAP.put("40103", CCErrorCode.ERR11022);
        ERROR_CODE_MAP.put("40104", CCErrorCode.ERR12051);
        ERROR_CODE_MAP.put("40105", CCErrorCode.ERR12052);
        ERROR_CODE_MAP.put("40106", CCErrorCode.ERR12053);
        ERROR_CODE_MAP.put("40107", CCErrorCode.ERR12055);
        ERROR_CODE_MAP.put("40110", CCErrorCode.ERR12056);
        ERROR_CODE_MAP.put("40111", CCErrorCode.ERR12057);
        ERROR_CODE_MAP.put("40112", CCErrorCode.ERR14010);
        ERROR_CODE_MAP.put("40113", CCErrorCode.ERR12058);
        ERROR_CODE_MAP.put("40114", CCErrorCode.ERR12063);
        ERROR_CODE_MAP.put("40130", CCErrorCode.ERR12072);
        ERROR_CODE_MAP.put("40131", CCErrorCode.ERR12068);
        ERROR_CODE_MAP.put("40132", CCErrorCode.ERR12069);
        ERROR_CODE_MAP.put("40133", CCErrorCode.ERR12070);
        ERROR_CODE_MAP.put("40134", CCErrorCode.ERR12071);
        ERROR_CODE_MAP.put("40135", CCErrorCode.ERR12078);
        ERROR_CODE_MAP.put("40136", CCErrorCode.ERR12079);
        ERROR_CODE_MAP.put("40137", CCErrorCode.ERR12080);
        ERROR_CODE_MAP.put("40138", CCErrorCode.ERR12081);
        ERROR_CODE_MAP.put("40139", CCErrorCode.ERR10008);
        ERROR_CODE_MAP.put("40140", CCErrorCode.ERR12086);

        ERROR_CODE_MAP.put("40150", CCErrorCode.ERR12082);
        ERROR_CODE_MAP.put("40151", CCErrorCode.ERR12083);
        ERROR_CODE_MAP.put("40152", CCErrorCode.ERR12084);
        ERROR_CODE_MAP.put("40153", CCErrorCode.ERR12085);
        ERROR_CODE_MAP.put("40154", CCErrorCode.ERR11036);
        ERROR_CODE_MAP.put("40185", CCErrorCode.ERR12121);
        ERROR_CODE_MAP.put("40186", CCErrorCode.ERR12122);
        ERROR_CODE_MAP.put("40187", CCErrorCode.ERR12123);
        ERROR_CODE_MAP.put("40156", CCErrorCode.ERR12124);

        ERROR_CODE_MAP.put("40159", CCErrorCode.ERR12089);
        ERROR_CODE_MAP.put("40160", CCErrorCode.ERR12090);
        ERROR_CODE_MAP.put("40161", CCErrorCode.ERR12091);
        ERROR_CODE_MAP.put("40162", CCErrorCode.ERR12092);
        ERROR_CODE_MAP.put("40163", CCErrorCode.ERR12093);
        ERROR_CODE_MAP.put("40164", CCErrorCode.ERR12094);
        ERROR_CODE_MAP.put("40165", CCErrorCode.ERR12095);
        ERROR_CODE_MAP.put("40166", CCErrorCode.ERR12096);
        ERROR_CODE_MAP.put("40167", CCErrorCode.ERR12097);
        ERROR_CODE_MAP.put("40007", CCErrorCode.ERR12098);
        ERROR_CODE_MAP.put("40168", CCErrorCode.ERR12099);
        ERROR_CODE_MAP.put("40169", CCErrorCode.ERR12100);
        ERROR_CODE_MAP.put("40170", CCErrorCode.ERR12101);
        ERROR_CODE_MAP.put("40171", CCErrorCode.ERR12102);
        ERROR_CODE_MAP.put("40172", CCErrorCode.ERR12103);
        ERROR_CODE_MAP.put("40173", CCErrorCode.ERR12104);
        ERROR_CODE_MAP.put("40174", CCErrorCode.ERR12105);
        ERROR_CODE_MAP.put("40175", CCErrorCode.ERR12106);
        ERROR_CODE_MAP.put("40176", CCErrorCode.ERR12107);
        ERROR_CODE_MAP.put("40177", CCErrorCode.ERR12108);
        ERROR_CODE_MAP.put("40178", CCErrorCode.ERR12109);
        ERROR_CODE_MAP.put("40179", CCErrorCode.ERR12110);
        ERROR_CODE_MAP.put("40180", CCErrorCode.ERR12111);
        ERROR_CODE_MAP.put("40181", CCErrorCode.ERR12112);
        ERROR_CODE_MAP.put("40182", CCErrorCode.ERR12113);
        ERROR_CODE_MAP.put("40183", CCErrorCode.ERR11041);
        ERROR_CODE_MAP.put("40184", CCErrorCode.ERR11042);
        ERROR_CODE_MAP.put("40190", CCErrorCode.ERR12128);
        ERROR_CODE_MAP.put("40191", CCErrorCode.ERR12129);
        ERROR_CODE_MAP.put("40192", CCErrorCode.ERR12130);
        ERROR_CODE_MAP.put("40193", CCErrorCode.ERR12131);
        ERROR_CODE_MAP.put("40194", CCErrorCode.ERR12132);
        ERROR_CODE_MAP.put("40195", CCErrorCode.ERR12133);
        ERROR_CODE_MAP.put("40196", CCErrorCode.ERR12134);
        ERROR_CODE_MAP.put("40197", CCErrorCode.ERR12135);
        ERROR_CODE_MAP.put("40108", CCErrorCode.ERR12136);
        ERROR_CODE_MAP.put("40198", CCErrorCode.ERR12137);
        ERROR_CODE_MAP.put("40200", CCErrorCode.ERR12140);
        ERROR_CODE_MAP.put("40201", CCErrorCode.ERR12141);


        ERROR_CODE_MAP.put("49900", CCErrorCode.ERR19999);
        ERROR_CODE_MAP.put("49990", CCErrorCode.ERR30003);
        ERROR_CODE_MAP.put("49991", CCErrorCode.ERR19017);
        ERROR_CODE_MAP.put("49992", CCErrorCode.ERR19016);
        ERROR_CODE_MAP.put("49998", CCErrorCode.ERR19018);
        //ERROR_CODE_MAP.put("49999", CCErrorCode.ERR19019);
    }
}
