from django.urls import path # type: ignore
from . import views

urlpatterns = [
    path('student/<int:student_id>/', views.student_detail, name='student_detail'),
    path('class/<int:class_id>/', views.class_details, name='class_details'),
    path('class/<int:class_id>/aggregated/', views.aggregated_details, name='aggregated_details'),
]
