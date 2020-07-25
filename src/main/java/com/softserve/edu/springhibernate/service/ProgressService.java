package com.softserve.edu.springhibernate.service;

import com.softserve.edu.springhibernate.model.Progress;
import com.softserve.edu.springhibernate.model.Task;
import com.softserve.edu.springhibernate.model.User;

import java.util.List;

public interface ProgressService {
    Progress getProgressById(Long id);
    Progress addTaskForStudent(Task task, User user);
    Progress addOrUpdateProgress(Progress progress);
    boolean setStatus(Progress.TaskStatus taskStatus, Progress progress);
    List<Progress> allProgressByUserIdAndMarathonId(Long userid, Long marathonid);
    List<Progress> allProgressByUserIdAndSprintId(Long userid, Long sprintid);
}
