public class test {
    public static void main(String[] args) {
        long ip4 = ipToLong2("10.200.33.239");
        long ip6 = ipToLong("2001:db8:10:200:0:0:0:239");
        System.out.println(ip4);
        System.out.println(ip6);
        System.out.println(longToIP(ip4));
        System.out.println(longToIP(ip6));
    }

    public static long ipToLong(String ipaddr)
    {
        if(ipaddr==null||"".equals(ipaddr)) return -1;
        long rtn = 0;
        String[] ss = ipaddr.split("\\:");
        if(ss.length<1) System.out.println("ip wrong");
        for (int i = 0; i < ss.length; i++){
            rtn <<= 8;
            rtn += Long.parseLong(ss[i],16);
        }
        for (int i = ss.length; i < 4; i++){
            rtn <<= 8;
        }
        return rtn;
    }

    public static String longToIP(long longIP)
    {
        StringBuffer sb = new StringBuffer("");
        sb.append(String.valueOf(longIP >>> 24));
        sb.append(":");
        sb.append(String.valueOf((longIP & (long)0xffffff) >>> 16));
        sb.append(":");
        sb.append(String.valueOf((longIP & (long)65535) >>> 8));
        sb.append(":");
        sb.append(String.valueOf(longIP & (long)255));
        return sb.toString();
    }

    public static long ipToLong2(String ipaddr)
    {
        if(ipaddr==null||"".equals(ipaddr)) return -1;
        long rtn = 0;
        String[] ss = ipaddr.split("\\.");
        if(ss.length<1) System.out.println("ip wrong");
        for (int i = 0; i < ss.length; i++){
            rtn <<= 8;
            rtn += Long.parseLong(ss[i]);
        }
        for (int i = ss.length; i < 4; i++){
            rtn <<= 8;
        }
        return rtn;
    }
}
