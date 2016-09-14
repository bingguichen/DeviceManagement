/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package net.binchen.elasticjob.spring.job;

import com.dangdang.ddframe.job.api.JobExecutionMultipleShardingContext;
import com.dangdang.ddframe.job.plugin.job.type.simple.AbstractSimpleElasticJob;
import net.binchen.elasticjob.fixture.repository.FooRepository;
import net.binchen.elasticjob.utils.PrintContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SimpleJobDemo extends AbstractSimpleElasticJob {
    
    private PrintContext printContext = new PrintContext(SimpleJobDemo.class);
    
    @Resource
    private FooRepository fooRepository;
    
    @Override
    public void process(final JobExecutionMultipleShardingContext context) {
        printContext.printProcessJobMessage(context.getShardingItems());
        System.out.println("-----------------------------" + fooRepository);
        fooRepository.findActive(context.getShardingItems());
        // do something
    }
}
