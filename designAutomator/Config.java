package designAutomator;

public class Config {
	// TODO: tStart = number of blocks
	static float tStart = 100000;
	static float tEnd = 0.0001f;
	static double binWidth = 5;
	// TODO: make it a good function
	static float alpha(double temperature){
		return 0.99f;
	}
	// based on temperature
	static float beta = 0.8f;
	static int innerConditionUpdate = 1;
	static int M = 500;
	static double freeToCellMoveRatio = 5;
	static double netToOverlapCostFact = 1000;
	
	static int max(int i, int j) {
		return i > j ? i : j;
	}
	
	static int min(int i, int j) {
		return i < j ? i : j;
	}
}
