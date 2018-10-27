package com.bms.jmx;


import javax.management.*;
import java.lang.management.ManagementFactory;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class JMXTutorialMainlauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is basic JMX tutorial");
		ObjectName objectName = null;
		try {
			objectName = new ObjectName("com.bms.tutorial:type=basic,name=game");
		} catch (MalformedObjectNameException e) {
			e.printStackTrace();
		}
		MBeanServer server = ManagementFactory.getPlatformMBeanServer();
		Game gameObj = new Game();
		try {
			server.registerMBean(gameObj, objectName);
		} catch (InstanceAlreadyExistsException | MBeanRegistrationException | NotCompliantMBeanException e) {
			e.printStackTrace();
		}
		System.out.println("Registration for Game mbean with the platform server is successfull");
		System.out.println("Please open jconsole to access Game mbean");
		while (true) {
			// to ensure application does not terminate
		}
	}

}
