//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.ModelEnum
import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Int

/**
 * FindError
 *
 * Generated from 'FindError' enum
 */
public sealed class FindError : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    /**
     * 'Asset' variant
     */
    public data class Asset(
        public val assetId: AssetId
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Asset>, ScaleWriter<Asset> {
            public const val DISCRIMINANT: Int = 0

            public override fun read(reader: ScaleCodecReader): Asset = try {
                Asset(
                    AssetId.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Asset) = try {
                AssetId.write(writer, instance.assetId)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'AssetDefinition' variant
     */
    public data class AssetDefinition(
        public val assetDefinitionId: AssetDefinitionId
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<AssetDefinition>, ScaleWriter<AssetDefinition> {
            public const val DISCRIMINANT: Int = 1

            public override fun read(reader: ScaleCodecReader): AssetDefinition = try {
                AssetDefinition(
                    AssetDefinitionId.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: AssetDefinition) = try {
                AssetDefinitionId.write(writer, instance.assetDefinitionId)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Account' variant
     */
    public data class Account(
        public val accountId: AccountId
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Account>, ScaleWriter<Account> {
            public const val DISCRIMINANT: Int = 2

            public override fun read(reader: ScaleCodecReader): Account = try {
                Account(
                    AccountId.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Account) = try {
                AccountId.write(writer, instance.accountId)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Domain' variant
     */
    public data class Domain(
        public val domainId: DomainId
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Domain>, ScaleWriter<Domain> {
            public const val DISCRIMINANT: Int = 3

            public override fun read(reader: ScaleCodecReader): Domain = try {
                Domain(
                    DomainId.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Domain) = try {
                DomainId.write(writer, instance.domainId)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'MetadataKey' variant
     */
    public data class MetadataKey(
        public val name: Name
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<MetadataKey>, ScaleWriter<MetadataKey> {
            public const val DISCRIMINANT: Int = 4

            public override fun read(reader: ScaleCodecReader): MetadataKey = try {
                MetadataKey(
                    Name.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: MetadataKey) = try {
                Name.write(writer, instance.name)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Block' variant
     */
    public data class Block(
        public val hashOf: HashOf<VersionedCommittedBlock>
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Block>, ScaleWriter<Block> {
            public const val DISCRIMINANT: Int = 5

            public override fun read(reader: ScaleCodecReader): Block = try {
                Block(
                    HashOf.read(reader) as HashOf<VersionedCommittedBlock>,
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Block) = try {
                HashOf.write(writer, instance.hashOf)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Transaction' variant
     */
    public data class Transaction(
        public val hashOf: HashOf<VersionedSignedTransaction>
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Transaction>, ScaleWriter<Transaction> {
            public const val DISCRIMINANT: Int = 6

            public override fun read(reader: ScaleCodecReader): Transaction = try {
                Transaction(
                    HashOf.read(reader) as HashOf<VersionedSignedTransaction>,
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Transaction) = try {
                HashOf.write(writer, instance.hashOf)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Peer' variant
     */
    public data class Peer(
        public val peerId: PeerId
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Peer>, ScaleWriter<Peer> {
            public const val DISCRIMINANT: Int = 7

            public override fun read(reader: ScaleCodecReader): Peer = try {
                Peer(
                    PeerId.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Peer) = try {
                PeerId.write(writer, instance.peerId)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Trigger' variant
     */
    public data class Trigger(
        public val triggerId: TriggerId
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Trigger>, ScaleWriter<Trigger> {
            public const val DISCRIMINANT: Int = 8

            public override fun read(reader: ScaleCodecReader): Trigger = try {
                Trigger(
                    TriggerId.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Trigger) = try {
                TriggerId.write(writer, instance.triggerId)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Role' variant
     */
    public data class Role(
        public val roleId: RoleId
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Role>, ScaleWriter<Role> {
            public const val DISCRIMINANT: Int = 9

            public override fun read(reader: ScaleCodecReader): Role = try {
                Role(
                    RoleId.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Role) = try {
                RoleId.write(writer, instance.roleId)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'PermissionTokenDefinition' variant
     */
    public data class PermissionTokenDefinition(
        public val permissionTokenId: PermissionTokenId
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<PermissionTokenDefinition>,
            ScaleWriter<PermissionTokenDefinition> {
            public const val DISCRIMINANT: Int = 10

            public override fun read(reader: ScaleCodecReader): PermissionTokenDefinition = try {
                PermissionTokenDefinition(
                    PermissionTokenId.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: PermissionTokenDefinition) = try {
                PermissionTokenId.write(writer, instance.permissionTokenId)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'PermissionToken' variant
     */
    public data class PermissionToken(
        public val permissionTokenFindError: PermissionTokenFindError
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<PermissionToken>, ScaleWriter<PermissionToken> {
            public const val DISCRIMINANT: Int = 11

            public override fun read(reader: ScaleCodecReader): PermissionToken = try {
                PermissionToken(
                    PermissionTokenFindError.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: PermissionToken) = try {
                PermissionTokenFindError.write(writer, instance.permissionTokenFindError)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'Parameter' variant
     */
    public data class Parameter(
        public val parameterId: ParameterId
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Parameter>, ScaleWriter<Parameter> {
            public const val DISCRIMINANT: Int = 12

            public override fun read(reader: ScaleCodecReader): Parameter = try {
                Parameter(
                    ParameterId.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: Parameter) = try {
                ParameterId.write(writer, instance.parameterId)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    /**
     * 'PublicKey' variant
     */
    public data class PublicKey(
        public val publicKey: jp.co.soramitsu.iroha2.generated.PublicKey
    ) : FindError() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<PublicKey>, ScaleWriter<PublicKey> {
            public const val DISCRIMINANT: Int = 13

            public override fun read(reader: ScaleCodecReader): PublicKey = try {
                PublicKey(
                    jp.co.soramitsu.iroha2.generated.PublicKey.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: PublicKey) = try {
                jp.co.soramitsu.iroha2.generated.PublicKey.write(writer, instance.publicKey)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    public companion object : ScaleReader<FindError>, ScaleWriter<FindError> {
        public override fun read(reader: ScaleCodecReader): FindError = when (
            val discriminant =
                reader.readUByte()
        ) {
            0 -> Asset.read(reader)
            1 -> AssetDefinition.read(reader)
            2 -> Account.read(reader)
            3 -> Domain.read(reader)
            4 -> MetadataKey.read(reader)
            5 -> Block.read(reader)
            6 -> Transaction.read(reader)
            7 -> Peer.read(reader)
            8 -> Trigger.read(reader)
            9 -> Role.read(reader)
            10 -> PermissionTokenDefinition.read(reader)
            11 -> PermissionToken.read(reader)
            12 -> Parameter.read(reader)
            13 -> PublicKey.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
        }

        public override fun write(writer: ScaleCodecWriter, instance: FindError) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> Asset.write(writer, instance as Asset)
                1 -> AssetDefinition.write(writer, instance as AssetDefinition)
                2 -> Account.write(writer, instance as Account)
                3 -> Domain.write(writer, instance as Domain)
                4 -> MetadataKey.write(writer, instance as MetadataKey)
                5 -> Block.write(writer, instance as Block)
                6 -> Transaction.write(writer, instance as Transaction)
                7 -> Peer.write(writer, instance as Peer)
                8 -> Trigger.write(writer, instance as Trigger)
                9 -> Role.write(writer, instance as Role)
                10 -> PermissionTokenDefinition.write(writer, instance as PermissionTokenDefinition)
                11 -> PermissionToken.write(writer, instance as PermissionToken)
                12 -> Parameter.write(writer, instance as Parameter)
                13 -> PublicKey.write(writer, instance as PublicKey)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
            }
        }
    }
}