package multitenant.table.per.hierarchy

import grails.gorm.MultiTenant

class BaseFoo implements MultiTenant<BaseFoo> {
    String tenantId = 'test'
    String bar = 'bar'

    static constraints = {
    }

    static mapping = {
        tablePerHierarchy false
    }
}
