package rank.rankRepository;


public class RankRepository {

	private static volatile RankRepository instance;

    private RankRepository() { }

    public static RankRepository getInstance() {
        if (instance == null) {
            synchronized (RankRepository.class) {
                if (instance == null) {
                    instance = new RankRepository();
                }
            }
        }
        return instance;
    }
}
