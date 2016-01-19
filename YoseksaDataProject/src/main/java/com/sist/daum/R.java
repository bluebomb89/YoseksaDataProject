package com.sist.daum;

import org.rosuda.REngine.Rserve.RConnection;

public class R {
	public void wordcloud(String place){
		try{
			System.out.println("RRRRR");
    		RConnection rc=new RConnection();
    		rc.setStringEncoding("utf8");
//    		rc.voidEval("Sys.setenv(JAVA_HOME=\"C:/Program Files/Java/jre1.8.0_60\")");
    		rc.voidEval("library(rJava)");
    		rc.voidEval("library(KoNLP)");
    		rc.voidEval("library(RColorBrewer)");
    		rc.voidEval("library(wordcloud)");
    		rc.voidEval("useSejongDic()");
    		rc.voidEval("f<-file(\"//211.238.142.144/datas/files/"+place+".txt\")");
    		rc.voidEval("textLine<-readLines(f)");
    		rc.voidEval("nouns<-sapply(textLine,extractNoun,USE.NAMES=F)");
    		rc.voidEval("data3<-unlist(nouns)");
    		rc.voidEval("nouns<-Filter(function(x) {nchar(x) >= 2}, data3)");
    		rc.voidEval("word<-table(unlist(nouns))");
    		rc.voidEval("png(\"//211.238.142.144/datas/cloud/"+place+".png\")");
    		rc.voidEval("wordcloud(names(word),freq=word,min.freq=2,rot.per=.2,scale=c(8,0,3),colors=rainbow(7),max.words=100,random.order=F)");
    		rc.voidEval("dev.off()");
    		rc.close();
		}catch(Exception ex){System.out.println(ex.getMessage());}
	}
}
