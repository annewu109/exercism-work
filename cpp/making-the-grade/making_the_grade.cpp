#include <array>
#include <string>
#include <vector>
#include <iostream>

// Round down all provided student scores.
std::vector<int> round_down_scores(std::vector<double> student_scores) {
    std::vector<int> rounded;
    
    for (int i{0}; i < student_scores.size(); i++) {
        rounded.emplace_back(static_cast<int>(student_scores.at(i)));
    }

    return rounded;
}


// Count the number of failing students out of the group provided.
int count_failed_students(std::vector<int> student_scores) {
    int failed_students{0};
    for (int i{0}; i < student_scores.size(); i++) {
        if (student_scores.at(i) <= 40) {
            failed_students++;
        }
    }
    return failed_students;
}

// Determine how many of the provided student scores were 'the best' based on the provided threshold.
std::vector<int> above_threshold(std::vector<int> student_scores, int threshold) {
    std::vector<int> best_students;
    
    for (int i{0}; i < student_scores.size(); i++) {
        if (student_scores.at(i) >= threshold) {
            best_students.emplace_back(student_scores.at(i));
        }
    }

    return best_students;
}

// Create a list of grade thresholds based on the provided highest grade.
std::array<int, 4> letter_grades(int highest_score) {
    int threshold_length = (highest_score - 40) / 4;
    std::array<int, 4> thresholds;

    int index{0};
    for (int i{41}; i < highest_score; i += threshold_length) {
        thresholds.at(index++) = i;
    }

    return thresholds;
}

// Organize the student's rank, name, and grade information in ascending order.
std::vector<std::string> student_ranking(std::vector<int> student_scores, std::vector<std::string> student_names) {
    std::vector<std::string> rankings;
    for (int i{0}; i < student_scores.size(); i++) {
        rankings.emplace_back(std::to_string(i + 1) + ". " + student_names.at(i) + ": " + std::to_string(student_scores.at(i)));
    }
    return rankings;
}

// Create a string that contains the name of the first student to make a perfect score on the exam.
std::string perfect_score(std::vector<int> student_scores, std::vector<std::string> student_names) {
    for (int i{0}; i < student_scores.size(); i++) {
        if (student_scores.at(i) == 100) {
            return student_names.at(i);
        }
    }
    return "";
}
