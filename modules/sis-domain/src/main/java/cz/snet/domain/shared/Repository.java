package cz.snet.domain.shared;

public interface Repository<E extends Entity<E, I>, I> {
  E find(I id);
  void store(E entity);
}
