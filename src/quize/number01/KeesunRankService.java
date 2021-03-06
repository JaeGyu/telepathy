package quize.number01;

/**
 * @author Keesun Baik
 */
public class KeesunRankService implements RankingService{

	@Override
	public int[] rank(int[] scores) {
		int veryBigArraySize = 100;
		int[] rankingIndex = new int[veryBigArraySize];
		int[] rankings = new int[scores.length];

		for(int i = 0 ; i < scores.length ; i++) {
			rankingIndex[scores[i]-1] += 1;
		}

		for(int i = 0 ; i < scores.length ; i++) {
			int num = scores[i];
			int rank = 1;
//			System.out.println("num: " + num);
//			System.out.println("=========");
			for(int j = veryBigArraySize ; j > num ; j--) {
//				System.out.println("j: " + j);
//				System.out.println("rankingIndex[j-1]: " + rankingIndex[j-1]);
				rank += rankingIndex[j-1];
//				System.out.println("rank: " + rank);
			}
			rankings[i] = rank;
		}

		return rankings;
	}
}
