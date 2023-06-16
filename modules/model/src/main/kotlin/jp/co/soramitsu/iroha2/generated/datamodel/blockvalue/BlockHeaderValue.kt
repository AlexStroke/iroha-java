//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.blockvalue

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.generated.crypto.hash.Hash
import jp.co.soramitsu.iroha2.generated.crypto.hash.HashOf
import jp.co.soramitsu.iroha2.generated.datamodel.transaction.VersionedSignedTransaction
import jp.co.soramitsu.iroha2.wrapException
import java.math.BigInteger
import kotlin.collections.List

/**
 * BlockHeaderValue
 *
 * Generated from 'iroha_data_model::block_value::BlockHeaderValue' regular structure
 */
public data class BlockHeaderValue(
    public val timestamp: BigInteger,
    public val height: BigInteger,
    public val previousBlockHash: Hash? = null,
    public val transactionsHash: HashOf<List<VersionedSignedTransaction>>? = null,
    public val rejectedTransactionsHash: HashOf<List<VersionedSignedTransaction>>? = null,
    public val invalidatedBlocksHashes: List<Hash>,
    public val currentBlockHash: Hash
) {
    public companion object : ScaleReader<BlockHeaderValue>, ScaleWriter<BlockHeaderValue> {
        public override fun read(reader: ScaleCodecReader): BlockHeaderValue = try {
            BlockHeaderValue(
                reader.readUint128(),
                reader.readUint64(),
                reader.readNullable(Hash) as Hash?,
                reader.readNullable(HashOf) as HashOf<List<VersionedSignedTransaction>>?,
                reader.readNullable(HashOf) as HashOf<List<VersionedSignedTransaction>>?,
                reader.readVec(reader.readCompactInt()) { Hash.read(reader) },
                Hash.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: BlockHeaderValue) = try {
            writer.writeUint128(instance.timestamp)
            writer.writeUint64(instance.height)
            writer.writeNullable(Hash, instance.previousBlockHash)
            writer.writeNullable(HashOf, instance.transactionsHash)
            writer.writeNullable(HashOf, instance.rejectedTransactionsHash)
            writer.writeCompact(instance.invalidatedBlocksHashes.size)
            instance.invalidatedBlocksHashes.forEach { value ->
                Hash.write(writer, value)
            }
            Hash.write(writer, instance.currentBlockHash)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}