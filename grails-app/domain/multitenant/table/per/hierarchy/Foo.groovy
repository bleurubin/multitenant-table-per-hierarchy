package multitenant.table.per.hierarchy

import grails.gorm.MultiTenant

class Foo extends BaseFoo implements MultiTenant<Foo> {
    String name

    static constraints = {
    }
}
