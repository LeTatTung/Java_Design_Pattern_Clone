package com.letattung.adapterpattern;

public class AdapterPatternDemo {

	public static void main(String [] args){
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "vang trang khoc.mp3");
		audioPlayer.play("mp4", "japan antil virus.mp4");
		audioPlayer.play("vlc", "test.vlc");
		audioPlayer.play("xcv", "heheh.xcv");
	}
}
