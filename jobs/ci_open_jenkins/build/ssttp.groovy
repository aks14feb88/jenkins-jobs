package ci_open_jenkins.build

import javaposse.jobdsl.dsl.DslFactory
import uk.gov.hmrc.jenkinsjobbuilders.domain.builder.BuildMonitorViewBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtFrontendJobBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtLibraryJobBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtMicroserviceJobBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.GradleMicroserviceJobBuilder

new SbtMicroserviceJobBuilder('zone-health').build(this as DslFactory)

new SbtMicroserviceJobBuilder('self-service-time-to-pay').build(this as DslFactory)

new SbtFrontendJobBuilder('self-service-time-to-pay-frontend').build(this as DslFactory)

new SbtLibraryJobBuilder('http-verbs-java').build(this as DslFactory)

new SbtLibraryJobBuilder('play-filters-java').build(this as DslFactory)

new SbtLibraryJobBuilder('frontend-bootstrap-java').build(this as DslFactory)

new SbtLibraryJobBuilder('microservice-bootstrap-java').build(this as DslFactory)

new GradleMicroserviceJobBuilder('time-to-pay-arrangement').build(this as DslFactory)

new BuildMonitorViewBuilder('SSTTP-MONITOR')
        .withJobs('self-service-time-to-pay','self-service-time-to-pay-frontend', 'time-to-pay-arrangement').build(this)
