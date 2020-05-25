package log;

public class LoggerTester {	//로그 테스터

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
		logger.log("test");
	}
}
