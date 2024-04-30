import { TurboModule, TurboModuleRegistry } from "react-native";

export interface Spec extends TurboModule {
  getDeviceModel(): Promise<string>;
}

export default TurboModuleRegistry.get<Spec>("RTNDeviceinfo") as Spec | null;