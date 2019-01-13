# Java_Experiment

本仓库为Java课程实验代码库



- 仓库下与本文件同层的首层文件夹为实验次数，内层文件夹为实验内题目标号，src文件夹下为工程的java源文件
- 代码使用的 IDE 主要是 Intellij IDEA， 较少时候使用Eclipse，但保证经过了[**阿里巴巴Java开发手册**](https://github.com/alibaba/p3c)的基本要求（部分代码由于题目要求可能并不遵守此规约），运行class文件时带有自定义参数 `-ea`
- 代码使用的 JDK 主要是 Oracle JDK 11 和 Open JDK 8 （两个版本均包括但不限于[**AdoptOpenJDK**](https://adoptopenjdk.net/index.html?variant=openjdk11&jvmVariant=hotspot) ,AWS的[**Corretto**](https://github.com/corretto) 和 [**Open JDK**](https://openjdk.java.net/)），不作于任何商业用途。
- 仓库中的代码简记是自己学习的时候整理记录的，借鉴了API和网络的部分内容，以后有时间会考虑写完自己的总结
- 目前PTA的所有题目都完成了AC代码，Java课程做过的PTA题目对应的代码链接如下



> # Java 代码仓库目录
>
>
>
> ## 山东科技大学计算机学院2018年面向对象程序设计（Java）
>
> 1. [7-2 jmu-Java-03面向对象-06-继承覆盖综合练习-Person、Student、Employee、Company （15 point(s)](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-03%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1-06-%E7%BB%A7%E6%89%BF%E8%A6%86%E7%9B%96%E7%BB%BC%E5%90%88%E7%BB%83%E4%B9%A0/src/Main.java)
>
>     [jmu-Java-03面向对象-06-继承覆盖综合练习](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-03%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1-06-%E7%BB%A7%E6%89%BF%E8%A6%86%E7%9B%96%E7%BB%BC%E5%90%88%E7%BB%83%E4%B9%A0/src/Main.java)
>
> 2. [7-3 字符串反转 （15 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E5%AD%97%E7%AC%A6%E4%B8%B2%E5%8F%8D%E8%BD%AC/src/Main.java)
>
> ## 2017级计算机专业3-5班习题集2
>
> 1. [6-1 jmu-Java-05集合-List中指定元素的删除 （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-05%E9%9B%86%E5%90%88-List%E4%B8%AD%E6%8C%87%E5%AE%9A%E5%85%83%E7%B4%A0%E7%9A%84%E5%88%A0%E9%99%A4/src/Main.java)
> 2. [6-2 jmu-Java-06异常-多种类型异常的捕获 （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-06%E5%BC%82%E5%B8%B8-%E5%A4%9A%E7%A7%8D%E7%B1%BB%E5%9E%8B%E5%BC%82%E5%B8%B8%E7%9A%84%E6%8D%95%E8%8E%B7/src/Main.java)
> 3. [6-3 可排序的学生类 （15 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E5%8F%AF%E6%8E%92%E5%BA%8F%E7%9A%84%E5%AD%A6%E7%94%9F%E7%B1%BB/src/Main.java)
> 4. [7-1 jmu-Java-03面向对象基础-04-形状-继承 （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-03%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E5%9F%BA%E7%A1%80-04-%E5%BD%A2%E7%8A%B6-%E7%BB%A7%E6%89%BF/src/Main.java)
> 5. [7-2 jmu-Java-04面向对象进阶-03-接口-自定义接口ArrayIntegerStack （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-04%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E8%BF%9B%E9%98%B6-03-%E6%8E%A5%E5%8F%A3-%E8%87%AA%E5%AE%9A%E4%B9%89%E6%8E%A5%E5%8F%A3ArrayIntegerStack/src/Main.java)
> 6. [7-3 jmu-Java-02基本语法-03-身份证排序 （15 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-02%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95-03-%E8%BA%AB%E4%BB%BD%E8%AF%81%E6%8E%92%E5%BA%8F/src/Main.java)
>
> ## 2017级计算机专业3-5班习题集3
>
> 1. [6-1 可排序的学生类 （20 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E5%8F%AF%E6%8E%92%E5%BA%8F%E7%9A%84%E5%AD%A6%E7%94%9F%E7%B1%BB/src/Main.java)
> 2. [7-2 jmu-Java&Python-统计文字中的单词数量并按出现次数排序 （25 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java%26Python-%E7%BB%9F%E8%AE%A1%E6%96%87%E5%AD%97%E4%B8%AD%E7%9A%84%E5%8D%95%E8%AF%8D%E6%95%B0%E9%87%8F%E5%B9%B6%E6%8C%89%E5%87%BA%E7%8E%B0%E6%AC%A1%E6%95%B0%E6%8E%92%E5%BA%8F/src/Main.java)
>
> ## 2017级计算机专业3-5班习题4
>
> 1. [6-1 设计一个矩形类Rectangle （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E8%AE%BE%E8%AE%A1%E4%B8%80%E4%B8%AA%E7%9F%A9%E5%BD%A2%E7%B1%BBRectangle/src/Main.java)
> 2. [6-2 从抽象类shape类扩展出一个圆形类Circle （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E4%BB%8E%E6%8A%BD%E8%B1%A1%E7%B1%BBshape%E7%B1%BB%E6%89%A9%E5%B1%95%E5%87%BA%E4%B8%80%E4%B8%AA%E5%9C%86%E5%BD%A2%E7%B1%BBCircle/src/Main.java)
> 3. [6-3 jmu-Java-05集合-List中指定元素的删除 （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-05%E9%9B%86%E5%90%88-List%E4%B8%AD%E6%8C%87%E5%AE%9A%E5%85%83%E7%B4%A0%E7%9A%84%E5%88%A0%E9%99%A4/src/Main.java)
> 4. [6-4 可排序的学生类 （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E5%8F%AF%E6%8E%92%E5%BA%8F%E7%9A%84%E5%AD%A6%E7%94%9F%E7%B1%BB/src/Main.java)
> 5. [7-1 求分数序列前N项和 （15 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E6%B1%82%E5%88%86%E6%95%B0%E5%BA%8F%E5%88%97%E5%89%8DN%E9%A1%B9%E5%92%8C/src/Main.java)
> 6. [7-2 找最长的字符串 （15 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E6%89%BE%E6%9C%80%E9%95%BF%E7%9A%84%E5%AD%97%E7%AC%A6%E4%B8%B2/src/Main.java)
> 7. [7-3 jmu-Java-03面向对象基础-01-构造函数与toString （3 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-03%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E5%9F%BA%E7%A1%80-01-%E6%9E%84%E9%80%A0%E5%87%BD%E6%95%B0%E4%B8%8EtoString/src/Main.java)
> 8. [7-4 jmu-Java-03面向对象基础-02-构造函数与初始化块 （5 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-03%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E5%9F%BA%E7%A1%80-02-%E6%9E%84%E9%80%A0%E5%87%BD%E6%95%B0%E4%B8%8E%E5%88%9D%E5%A7%8B%E5%8C%96%E5%9D%97/src/Main.java)
> 9. [7-5 jmu-Java&Python-统计一段文字中的单词个数并按单词的字母顺序排序后输出 （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java%26Python-%E7%BB%9F%E8%AE%A1%E4%B8%80%E6%AE%B5%E6%96%87%E5%AD%97%E4%B8%AD%E7%9A%84%E5%8D%95%E8%AF%8D%E4%B8%AA%E6%95%B0%E5%B9%B6%E6%8C%89%E5%8D%95%E8%AF%8D%E7%9A%84%E5%AD%97%E6%AF%8D%E9%A1%BA%E5%BA%8F%E6%8E%92%E5%BA%8F%E5%90%8E%E8%BE%93%E5%87%BA/src/Main.java)
> 10. [7-6 构造方法 （5 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E6%9E%84%E9%80%A0%E6%96%B9%E6%B3%95/src/Main.java)
>
> ## 2017级计算机专业3-5班习题6
>
> 1. [6-1 创建一个直角三角形类实现IShape接口 （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E5%88%9B%E5%BB%BA%E4%B8%80%E4%B8%AA%E7%9B%B4%E8%A7%92%E4%B8%89%E8%A7%92%E5%BD%A2%E7%B1%BB%E5%AE%9E%E7%8E%B0IShape%E6%8E%A5%E5%8F%A3/src/Main.java)
> 2. [6-2 jmu-Java-03面向对象基础-覆盖与equals （6 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-03%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E5%9F%BA%E7%A1%80-%E8%A6%86%E7%9B%96%E4%B8%8Eequals/src/Main.java)
> 3. [6-3 jmu-Java-03面向对象基础-Object （5 point(s)）](https://github.com/FancyKings/Java_Experiment/tree/master/PTA-CS/jmu-Java-03%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E5%9F%BA%E7%A1%80-Object/src)____
> 4. [6-4 jmu-Java-06异常-finally （8 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-06%E5%BC%82%E5%B8%B8-finally/src/Main.java)
> 5. [7-1 求一组数组中的平均数 （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E6%B1%82%E4%B8%80%E7%BB%84%E6%95%B0%E7%BB%84%E4%B8%AD%E7%9A%84%E5%B9%B3%E5%9D%87%E6%95%B0/src/Main.java)
> 6. [7-2 JAVA-求整数序列中出现次数最多的数 （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/JAVA-%E6%B1%82%E6%95%B4%E6%95%B0%E5%BA%8F%E5%88%97%E4%B8%AD%E5%87%BA%E7%8E%B0%E6%AC%A1%E6%95%B0%E6%9C%80%E5%A4%9A%E7%9A%84%E6%95%B0/src/Main.java)
> 7. [7-3 统计正数和负数的个数然后计算这些数的平均值 （11 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E7%BB%9F%E8%AE%A1%E6%AD%A3%E6%95%B0%E5%92%8C%E8%B4%9F%E6%95%B0%E7%9A%84%E4%B8%AA%E6%95%B0%E7%84%B6%E5%90%8E%E8%AE%A1%E7%AE%97%E8%BF%99%E4%BA%9B%E6%95%B0%E7%9A%84%E5%B9%B3%E5%9D%87%E5%80%BC/src/Main.java)
> 8. [7-4 数组元素的删除 （5 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E6%95%B0%E7%BB%84%E5%85%83%E7%B4%A0%E7%9A%84%E5%88%A0%E9%99%A4/src/Main.java)
> 9. [7-5 成绩录入时的及格与不及格人数统计 （5 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E6%88%90%E7%BB%A9%E5%BD%95%E5%85%A5%E6%97%B6%E7%9A%84%E5%8F%8A%E6%A0%BC%E4%B8%8E%E4%B8%8D%E5%8F%8A%E6%A0%BC%E4%BA%BA%E6%95%B0%E7%BB%9F%E8%AE%A1/src/Main.java)
> 10. [7-6 jmu-Java-02基本语法-02-StringBuilder （1 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/jmu-Java-02%E5%9F%BA%E6%9C%AC%E8%AF%AD%E6%B3%95-02-StringBuilder/src/Main.java)
> 11. [7-7 求矩阵主对角线元素的和 （10 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E6%B1%82%E7%9F%A9%E9%98%B5%E4%B8%BB%E5%AF%B9%E8%A7%92%E7%BA%BF%E5%85%83%E7%B4%A0%E7%9A%84%E5%92%8C/src/Main.java)
> 12. [7-8 整理队伍 （5 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E6%95%B4%E7%90%86%E9%98%9F%E4%BC%8D/src/Main.java)
> 13. [7-9 超市贴花 （5 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/PTA-CS/%E8%B6%85%E5%B8%82%E8%B4%B4%E8%8A%B1/src/Main.java)
>
> ## 山东科技大学2018—2019 学年第一学期《面向对象程序设计实验（Java）》考试试卷（计算机17）
>
> > 这个实验考试老师设置了完成考试不能查看
>
> 1. [7-1 求最大值](https://github.com/FancyKings/Java_Experiment/blob/master/Final-exam/%E6%B1%82%E6%9C%80%E5%A4%A7%E5%80%BC/src/Main.java)
> 2. [7-2 学生类-构造函数](https://github.com/FancyKings/Java_Experiment/blob/master/Final-exam/%E5%AD%A6%E7%94%9F%E7%B1%BB-%E6%9E%84%E9%80%A0%E5%87%BD%E6%95%B0/src/Main.java)
>
>
>
> ## 山东科技大学2018—2019 学年第一学期《面向对象程序设计（Java）》考试试卷（计算机17）A卷
>
> 1. [7-1 sdust-Java-学生成绩读取与排序 （16 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/Final-exam/sdust-Java-%E5%AD%A6%E7%94%9F%E6%88%90%E7%BB%A9%E8%AF%BB%E5%8F%96%E4%B8%8E%E6%8E%92%E5%BA%8F/src/Main.java)
> 2. [7-2 数组元素交换 （12 point(s)）](https://github.com/FancyKings/Java_Experiment/blob/master/Final-exam/%E6%95%B0%E7%BB%84%E5%85%83%E7%B4%A0%E4%BA%A4%E6%8D%A2/src/Main.java)
>
>