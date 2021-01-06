package org.xazab.dapiclient

import org.bitcoinj.core.Block
import org.xazab.dpp.StateRepository
import org.xazab.dpp.contract.DataContract
import org.xazab.dpp.document.Document
import org.xazab.dpp.identifier.Identifier
import org.xazab.dpp.identity.Identity

class StateRepositoryMock : StateRepository {
    override fun fetchDataContract(id: Identifier): DataContract? {
        TODO("Not yet implemented")
    }

    override fun fetchDocuments(contractId: Identifier, type: String, where: Any): List<Document> {
        TODO("Not yet implemented")
    }

    override fun fetchIdentity(id: Identifier): Identity? {
        TODO("Not yet implemented")
    }

    override fun fetchLatestPlatformBlockHeader(): Block {
        TODO("Not yet implemented")
    }

    override fun fetchTransaction(id: String): Int {
        TODO("Not yet implemented")
    }

    override fun removeDocument(contractId: Identifier, type: String, id: Identifier) {
        TODO("Not yet implemented")
    }

    override fun storeDataContract(dataContract: DataContract) {
        TODO("Not yet implemented")
    }

    override fun storeDocument(document: Document) {
        TODO("Not yet implemented")
    }

    override fun storeIdentity(identity: Identity) {
        TODO("Not yet implemented")
    }

    override fun storeIdentityPublicKeyHashes(identity: Identifier, publicKeyHashes: List<ByteArray>) {
        TODO("Not yet implemented")
    }
}