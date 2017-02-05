package com.letattung.adapterpattern1;

public class AudioPlayer implements MediaPlayer{

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		// ho tro san co de choi nhac mp3
		if (audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name: " +fileName);
		}
		// MediaAdapter dang cung cap cac ho tro de choi cac dinh dang khac
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
			MediaAdapter mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}

}
