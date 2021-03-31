flink  cep 应用开发

步骤
1,  建立流。
2，建立模式，匹配模式。
3，匹配后触发，触发事件

优秀案例：https://www.cnblogs.com/beeblog72/p/13877182.html

事件流：
控制台输入，socket。  输入 ：
error   msg
error   msg2
alert   msg3   
Event: grade 和  detail属性。
在5秒内，发现 2个（error , xxx） 事件， 报警。
报警内容： “error， 2 in 5 sec”


扩展：

