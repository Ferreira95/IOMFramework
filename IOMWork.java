// Proposta de esquelo inicial da Framework do IOM
// Tendo como base a pesquisa de interfaces naturais do usuario
// Myo, Leap, Kinect, Tobii, Epoc
// Por hora todos foram colocados na mesma classe de framework

public class IOMWork
{
	// Métodos de verificação de status
	
	public int onConnect();
	public int onDisconnect();
	public int onFailure();

	// Métodos de interação
	
	public void poseDefine(); // Definir ação personalizada para gesto.
	public int onPose(); // verificação de gesto.

	// Métodos de controle do cursor - Usando o tipo abstrato vector 2
	
	public void setPosition(vector2 pos);
	public vector2 getPosition();
	public void blockPosition();

	// Possível método de nível mais baixo de implementação
	
	public void onAcelerometerData();
	
	// Possível métodos de implementação para versão 2.0 do IOM
	
	public void onGyroscopeData();
	public int requesteBatteryLevel();
	public int requestSignalLevel();

	// Método para configuração manual sem uso da interface padrão de config.

	public void IOMConfig();
}
