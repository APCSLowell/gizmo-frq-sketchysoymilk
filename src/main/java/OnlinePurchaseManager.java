import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
    int sum = 0;
    for(Gizmo hi : purchases){
      if(purchases.getMaker().equals(maker)){
        if(purchases.isElectronic() == true)
        sum++;
      }
    }
    return sum;
  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
    Gizmo hi = purchases.get(0);
    for (int i = 1; i < purchases.size(); i++)
    {
      Gizmo hiTwo = purchases.get(i);
      if (hi.equals(hiTwo))
      {
      return true;
      }
    hi = hiTwo;
}
return false; 
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
