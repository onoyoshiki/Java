public class Timer {
	private long startTime = 0L;
	private long stopTime = 0L;
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		stopTime = System.currentTimeMillis();
	}
	public double getTime() {
		double interval = (double) (stopTime - startTime) / 1000;
		return interval;
	}
}
