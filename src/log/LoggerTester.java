package log;

public class LoggerTester {	//�α� �׽���

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
		logger.log("test");
	}
}
