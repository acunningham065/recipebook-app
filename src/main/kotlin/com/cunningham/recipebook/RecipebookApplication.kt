package com.cunningham.recipebook

import com.zaxxer.hikari.HikariDataSource
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class RecipebookApplication

fun main(args: Array<String>) {
	runApplication<RecipebookApplication>(*args)
}

//@Bean
//@ConfigurationProperties("app.datasource")
//fun DataSourceProperties(): DataSourceProperties {
//	return com.cunningham.recipebook.DataSourceProperties()
//}
//
//@Bean
//@ConfigurationProperties("app.datasource")
//fun DataSource(properties: DataSourceProperties): HikariDataSource {
//	return properties.initializeDataSourceBuilder().type(HikariDataSource::class.java).build()
//}
