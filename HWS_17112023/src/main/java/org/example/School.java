package org.example;

import java.lang.reflect.Field;

public class School {
		@StudentInfo(name = "Tom", surname = "Smith", age = 15)
		Student student1;

		@StudentInfo(name = "Mary", surname = "Jennings", age = 17)
		Student student2;

		public School() {
				initializeStudents();
		}

		private void initializeStudents() {
				Field[] fields = getClass().getDeclaredFields();
				for (Field field : fields) {
						if (field.isAnnotationPresent(StudentInfo.class) && field.getType() == Student.class) {
								StudentInfo annotation = field.getAnnotation(StudentInfo.class);
								Student student = new Student();
								student.setName(annotation.name());
								student.setSurname(annotation.surname());
								student.setAge(annotation.age());
								try {
										field.setAccessible(true);
										field.set(this, student);
								} catch (IllegalArgumentException | IllegalAccessException e) {
										e.printStackTrace();
								}

						}

				}
		}
}
