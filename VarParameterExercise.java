public class VarParameterExercise {
	public static void main(String[] args) {
		HspMethod h = new HspMethod();
		System.out.println(h.showScore("科比",99.2,99.6));
		System.out.println(h.showScore("乔丹",99.9,98.3,96.6));
	}
}
class HspMethod {
	public String showScore(String name,double...scores) {
		double totalScore = 0;
		for(int i=0;i<scores.length;i++) {
			totalScore +=scores[i];
		}
		return name+"有"+scores.length+"门课的成绩总分为="+totalScore;
	}
}