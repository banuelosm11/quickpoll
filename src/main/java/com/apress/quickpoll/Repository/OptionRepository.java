package com.apress.quickpoll.Repository;

import com.apress.quickpoll.Domain.Option;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by aurorabanuelos on 6/20/17.
 */
public interface OptionRepository extends CrudRepository<Option, Long> {
}
