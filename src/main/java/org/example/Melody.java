package org.example;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Melody {
    HashMap<Clip, long[]> map = new HashMap<>();


    public boolean addFile(String path, long start, long end){
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            map.put(clip, new long[]{start, end});

            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean addFiles(String[] paths, long[] start, long[] end){
        try {
            int i = 0;
            for(String path: paths) {
                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
                Clip clip = AudioSystem.getClip();
                clip.open(audio);
                map.put(clip, new long[]{start[i], end[i]});
                i++;
            }

           return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
