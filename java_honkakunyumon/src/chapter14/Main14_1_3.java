package chapter14;


UserInfo.original = new UserInfo();
original.setId(2);
original.setName("山田太郎");
original.setAge(30);
UserInfo copied = original; //別の変数に代入
copied.setAge(31);
System.out.println(original, getAge()); //31が表示される

