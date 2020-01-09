package cn.lmf;

import cn.lmf.creator.WordCreator;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        WordCreator wordCreator = new WordCreator(ResolveJson.resovle());
        wordCreator.create();
    }
}
