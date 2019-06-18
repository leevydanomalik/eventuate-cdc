package io.eventuate.local.unified.cdc.pipeline.dblog.common.configuration;

import io.eventuate.local.unified.cdc.pipeline.common.configuration.CommonCdcDefaultPipelineReaderConfiguration;
import io.eventuate.local.unified.cdc.pipeline.dblog.common.properties.CommonDbLogCdcPipelineReaderProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonDbLogCdcDefaultPipelineReaderConfiguration extends CommonCdcDefaultPipelineReaderConfiguration {

  protected void initCommonDbLogCdcPipelineReaderProperties(CommonDbLogCdcPipelineReaderProperties commonDbLogCdcPipelineReaderProperties) {
    commonDbLogCdcPipelineReaderProperties.setBinlogConnectionTimeoutInMilliseconds(eventuateConfigurationProperties.getBinlogConnectionTimeoutInMilliseconds());
    commonDbLogCdcPipelineReaderProperties.setMaxAttemptsForBinlogConnection(eventuateConfigurationProperties.getMaxAttemptsForBinlogConnection());
    commonDbLogCdcPipelineReaderProperties.setOffsetStorageTopicName(eventuateConfigurationProperties.getOffsetStorageTopicName());
    commonDbLogCdcPipelineReaderProperties.setMonitoringSchema(eventuateConfigurationProperties.getMonitoringSchema());
  }
}
