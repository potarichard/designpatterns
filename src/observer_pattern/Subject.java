package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject
{
	List<IObserver> observerList = new ArrayList<IObserver>();
	private int _flag;	
	private String message = "original message";
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
		notifyObservers(0);
	}
	public int get_flag() {
		return _flag;
	}
	public void set_flag(int _flag) {
		this._flag=_flag;
		notifyObservers(_flag);
	}
	
	
	
	@Override
	public void register(IObserver o) 
	{
		observerList.add(o);		
	}
	
	@Override
	public void unregister(IObserver o) 
	{
		observerList.remove(o);		
	}
	
	@Override
	public void notifyObservers(int value) 
	{
		for(int i=0;i<observerList.size();i++)
		{
		 observerList.get(i).update(value);
		}
	}
	
	
}
