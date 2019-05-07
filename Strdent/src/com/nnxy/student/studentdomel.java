package com.nnxy.student;

public class studentdomel {

		private int sex;
		private int age;
		private String name;
		private String parssword;
		public studentdomel(int sex, int age, String name, String parssword) {
			super();
			this.sex = sex;
			this.age = age;
			this.name = name;
			this.parssword = parssword;
		}
		public int getSex() {
			return sex;
		}
		public void setSex(int sex) {
			this.sex = sex;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getParssword() {
			return parssword;
		}
		public void setParssword(String parssword) {
			this.parssword = parssword;
		}
		
		
		

	}
