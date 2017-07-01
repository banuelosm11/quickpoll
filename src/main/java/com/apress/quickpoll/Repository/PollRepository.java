package com.apress.quickpoll.Repository;

import com.apress.quickpoll.Domain.Poll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by aurorabanuelos on 6/20/17.
 */
public interface PollRepository extends PagingAndSortingRepository<Poll, Long> {
}
