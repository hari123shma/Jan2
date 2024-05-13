package opps;
import java.util.Scanner;
interface TV_remote
{

	
	public void onoff();
	public void volume();
	public void channel();
	public void mute();
	
	
}
class SmartTV implements TV_remote
{

	

	@Override
	public void onoff() {
		System.out.println("ON/OFF");
		
	}

	@Override
	public void volume() {
		System.out.println("Volume + or -");
		
	}

	@Override
	public void channel() {
		System.out.println("Channel + and -");
		
	}

	@Override
	public void mute() {
		System.out.println("Enter * for mute");
		
	}
	
}


public class TV_remotep {

	public static void main(String[] args) {
	   SmartTV obj=new SmartTV();
	   obj.channel();
	   obj.mute();
	   obj.onoff();
	   obj.volume();

	}

}
