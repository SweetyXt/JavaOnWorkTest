import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;

import java.util.HashMap;

import java.util.Map;

import java.util.Set;



public class java10 {

    public static void main(String[] args) {

        //逐行读文件

        BufferedReader br = null;

        try {

            Map<String,Integer>map = new HashMap<String,Integer>();

            br = new BufferedReader(new FileReader("C:\\Users\\lenovo\\IdeaProjects\\$javawork\\java10：编程统计文件中的单词数量\\mywords.txt"));

            String line;

            while(null != (line = br.readLine())){

                System.out.println(line);

                //将字符串用空格分隔

                String[]ss = line.split("\\s+");

                for(String s : ss){

                    if(map.containsKey(s)){

                        map.put(s, map.get(s)+1);

                    }else{

                        map.put(s, 1);

                    }

                }

            }

            Set<String>keys = map.keySet();

            for(String key : keys){

                System.out.println(key + "有：" + map.get(key) + "个.");

            }

        }catch(FileNotFoundException e) {

            e.printStackTrace();

        }catch(IOException e) {

            e.printStackTrace();

        }finally {

            if(null != br){

                try {

                    br.close();

                }catch(IOException e) {

                    e.printStackTrace();

                }

            }

        }

    }

}
  