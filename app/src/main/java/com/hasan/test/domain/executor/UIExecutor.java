package com.hasan.test.domain.executor;

import io.reactivex.Scheduler;

public interface UIExecutor {
    Scheduler getScheduler();
}