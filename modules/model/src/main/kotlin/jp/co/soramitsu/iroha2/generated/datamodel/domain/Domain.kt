//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.domain

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.comparator
import jp.co.soramitsu.iroha2.generated.datamodel.account.Account
import jp.co.soramitsu.iroha2.generated.datamodel.asset.AssetDefinitionEntry
import jp.co.soramitsu.iroha2.generated.datamodel.asset.DefinitionId
import jp.co.soramitsu.iroha2.generated.datamodel.metadata.Metadata
import jp.co.soramitsu.iroha2.wrapException
import kotlin.collections.Map

/**
 * Domain
 *
 * Generated from 'iroha_data_model::domain::Domain' regular structure
 */
public data class Domain(
    public val id: Id,
    public val accounts: Map<jp.co.soramitsu.iroha2.generated.datamodel.account.Id, Account>,
    public val assetDefinitions: Map<DefinitionId, AssetDefinitionEntry>,
    public val logo: IpfsPath?,
    public val metadata: Metadata
) {
    public companion object : ScaleReader<Domain>, ScaleWriter<Domain> {
        public override fun read(reader: ScaleCodecReader): Domain = try {
            Domain(
                Id.read(reader),
                reader.readMap(
                    reader.readCompactInt(),
                    { jp.co.soramitsu.iroha2.generated.datamodel.account.Id.read(reader) },
                    { Account.read(reader) }
                ),
                reader.readMap(
                    reader.readCompactInt(), { DefinitionId.read(reader) },
                    { AssetDefinitionEntry.read(reader) }
                ),
                reader.readNullable(IpfsPath),
                Metadata.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: Domain) = try {
            Id.write(writer, instance.id)
            writer.writeCompact(instance.accounts.size)
            instance.accounts.toSortedMap(
                jp.co.soramitsu.iroha2.generated.datamodel.account.Id.comparator()
            ).forEach { (key, value) ->
                jp.co.soramitsu.iroha2.generated.datamodel.account.Id.write(writer, key)
                Account.write(writer, value)
            }
            writer.writeCompact(instance.assetDefinitions.size)
            instance.assetDefinitions.toSortedMap(
                jp.co.soramitsu.iroha2.generated.datamodel.asset.DefinitionId.comparator()
            ).forEach { (key, value) ->
                DefinitionId.write(writer, key)
                AssetDefinitionEntry.write(writer, value)
            }
            writer.writeNullable(IpfsPath, instance.logo)
            Metadata.write(writer, instance.metadata)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
