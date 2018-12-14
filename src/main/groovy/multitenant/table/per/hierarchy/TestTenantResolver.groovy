package multitenant.table.per.hierarchy

import org.grails.datastore.mapping.multitenancy.TenantResolver
import org.grails.datastore.mapping.multitenancy.exceptions.TenantNotFoundException
/**
 * Created by bleu on 12/13/18.
 */
class TestTenantResolver implements TenantResolver {
    @Override
    Serializable resolveTenantIdentifier() throws TenantNotFoundException {
        return 'test'
    }
}
