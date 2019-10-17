import java.util.List;

public interface IUserDao extends IGenericJpaDao {

    public abstract List<Mydictionary> getwords(Mydictionary mydictionary);

}
