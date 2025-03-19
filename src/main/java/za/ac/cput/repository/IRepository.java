package za.ac.cput.repository;

public interface IRepository<T,ID> { //T refers to Object //ID refers to a "PK"
    boolean create(T t);
    T read(ID id);
    boolean update(ID id,T t);
    boolean delete(ID id);
}
