package practice.designpattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern{
	public static void main(String[] args) {
		ManageObserver observer = new ManageObserver();
		observer.addObserver(new Observer("gaurav"));
		observer.addObserver(new Observer("omkar"));
		observer.notifyObserver("added");
	}
}
interface NotifyObserver{
	void notify(String message);
}
class Observer implements NotifyObserver{
	String name;
	Observer(String name){
		this.name=name;
	}
	@Override
	public void notify(String message) {
		System.out.println(name+":"+message);
	}
	
}
class ManageObserver{
	List<Observer> list = new ArrayList<>();
	void addObserver(Observer observer){
		list.add(observer);
	}
	public void notifyObserver(String message) {
		list.stream().forEach(obj->{
			obj.notify(message);
		});
	}
}