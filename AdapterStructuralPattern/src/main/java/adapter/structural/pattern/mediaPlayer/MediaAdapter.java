package adapter.structural.pattern.mediaPlayer;

import adapter.structural.pattern.advancedMediaPlayer.AdvancedMediaPlayer;
import adapter.structural.pattern.advancedMediaPlayer.Mp4Player;
import adapter.structural.pattern.advancedMediaPlayer.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
    /**
    *@description Adapter class 
    **/
    AdvancedMediaPlayer advancedMusicPlayer;
   public MediaAdapter(String audioType){ 
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();	 
      }
      else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }	
   } 
   @Override
   public void play(String audioType, String fileName) { 
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   } 
}
