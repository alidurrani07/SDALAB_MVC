from django.shortcuts import render # type: ignore
from .models import Student, Class # type: ignore


# View for individual student details
def student_detail(request, student_id):
    student = Student.objects.get(id=student_id)
    return render(request, 'student_detail.html', {'student': student})


# View for class details
def class_details(request, class_id):
    student_class = Class.objects.get(id=class_id)
    students = student_class.students.all()
    return render(request, 'class_details.html', {'students': students, 'student_class': student_class})


# View for aggregated GPA details
def aggregated_details(request, class_id):
    student_class = Class.objects.get(id=class_id)
    max_gpa = student_class.get_max_gpa()
    min_gpa = student_class.get_min_gpa()
    avg_gpa = student_class.get_avg_gpa()
    return render(request, 'aggregated_details.html', {
        'max_gpa': max_gpa, 'min_gpa': min_gpa, 'avg_gpa': avg_gpa
    })
