from django.db import models # type: ignore

class Student(models.Model):
    name = models.CharField(max_length=100)
    reg_no = models.CharField(max_length=20)
    gpa = models.FloatField()
    semester = models.CharField(max_length=10)

    def __str__(self):
        return self.name


class Class(models.Model):
    students = models.ManyToManyField(Student)

    def get_max_gpa(self):
        return self.students.all().aggregate(models.Max('gpa'))['gpa__max']

    def get_min_gpa(self):
        return self.students.all().aggregate(models.Min('gpa'))['gpa__min']

    def get_avg_gpa(self):
        return self.students.all().aggregate(models.Avg('gpa'))['gpa__avg']

    def __str__(self):
        return f"Class with {self.students.count()} students"
