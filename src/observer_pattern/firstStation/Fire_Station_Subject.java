package observer_pattern.firstStation;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 10. 31
 * Time: 오전 9:19
 * To change this template use File | Settings | File Templates.
 */
public abstract class Fire_Station_Subject {
  public abstract void addObserver(Team_Master_Object observer);
  public abstract void removeObserver(Team_Master_Object observer);
  public abstract void notifyToObserver();
}
