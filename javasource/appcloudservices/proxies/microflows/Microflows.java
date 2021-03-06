// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package appcloudservices.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the AppCloudServices module
	public static boolean checkUserRolesRemoved(IContext context, system.proxies.User _user)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("User", _user == null ? null : _user.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "AppCloudServices.CheckUserRolesRemoved", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void cleanupAuthRequest(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "AppCloudServices.CleanupAuthRequest", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static appcloudservices.proxies.AppCloudUser createAppCloudUser(IContext context, appcloudservices.proxies.UserProfile _userProfile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("UserProfile", _userProfile == null ? null : _userProfile.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "AppCloudServices.CreateAppCloudUser", params);
			return result == null ? null : appcloudservices.proxies.AppCloudUser.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String decrypt(IContext context, java.lang.String _encrypted)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Encrypted", _encrypted);
			return (java.lang.String)Core.execute(context, "AppCloudServices.Decrypt", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static appcloudservices.proxies.DecryptedToken dS_GetCurrentAccessToken(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "AppCloudServices.DS_GetCurrentAccessToken", params);
			return result == null ? null : appcloudservices.proxies.DecryptedToken.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static appcloudservices.proxies.AppCloudUser dS_GetCurrentAppCloudUser(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "AppCloudServices.DS_GetCurrentAppCloudUser", params);
			return result == null ? null : appcloudservices.proxies.AppCloudUser.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static appcloudservices.proxies.DecryptedToken dS_GetCurrentIdToken(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "AppCloudServices.DS_GetCurrentIdToken", params);
			return result == null ? null : appcloudservices.proxies.DecryptedToken.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static appcloudservices.proxies.DecryptedToken dS_GetCurrentRefreshToken(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "AppCloudServices.DS_GetCurrentRefreshToken", params);
			return result == null ? null : appcloudservices.proxies.DecryptedToken.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String encrypt(IContext context, java.lang.String _plain)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Plain", _plain);
			return (java.lang.String)Core.execute(context, "AppCloudServices.Encrypt", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean initializeAppCloudServices(IContext context, java.lang.String _createUserMicroflowName, java.lang.String _updateAppCloudUserMicroflowName)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("CreateUserMicroflowName", _createUserMicroflowName);
			params.put("UpdateAppCloudUserMicroflowName", _updateAppCloudUserMicroflowName);
			return (java.lang.Boolean)Core.execute(context, "AppCloudServices.InitializeAppCloudServices", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void inviteUserToApp(IContext context, java.lang.String _inviteeEmailAddress, system.proxies.UserRole _userRole, java.lang.String _inviterEmailAddress)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("InviteeEmailAddress", _inviteeEmailAddress);
			params.put("UserRole", _userRole == null ? null : _userRole.getMendixObject());
			params.put("InviterEmailAddress", _inviterEmailAddress);
			Core.execute(context, "AppCloudServices.InviteUserToApp", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void invokeOnAlreadyHasSessionAppCloudUser(IContext context, system.proxies.User _user)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("User", _user == null ? null : _user.getMendixObject());
			Core.execute(context, "AppCloudServices.InvokeOnAlreadyHasSessionAppCloudUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void invokeOnFirstLoginAppCloudUser(IContext context, appcloudservices.proxies.UserProfile _userProfile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("UserProfile", _userProfile == null ? null : _userProfile.getMendixObject());
			Core.execute(context, "AppCloudServices.InvokeOnFirstLoginAppCloudUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void invokeOnNonFirstLoginAppCloudUser(IContext context, appcloudservices.proxies.UserProfile _userProfile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("UserProfile", _userProfile == null ? null : _userProfile.getMendixObject());
			Core.execute(context, "AppCloudServices.InvokeOnNonFirstLoginAppCloudUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DecryptAndViewToken(IContext context, appcloudservices.proxies.Token _token)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Token", _token == null ? null : _token.getMendixObject());
			Core.execute(context, "AppCloudServices.IVK_DecryptAndViewToken", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DeleteAllTokens(IContext context, java.util.List<appcloudservices.proxies.Token> _tokenList)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_tokenList = null;
			if (_tokenList != null)
			{
				listparam_tokenList = new java.util.ArrayList<IMendixObject>();
				for (appcloudservices.proxies.Token obj : _tokenList)
					listparam_tokenList.add(obj.getMendixObject());
			}
			params.put("TokenList", listparam_tokenList);
			Core.execute(context, "AppCloudServices.IVK_DeleteAllTokens", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DeleteExpiredTokens(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "AppCloudServices.IVK_DeleteExpiredTokens", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DeleteToken(IContext context, appcloudservices.proxies.Token _token)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Token", _token == null ? null : _token.getMendixObject());
			Core.execute(context, "AppCloudServices.IVK_DeleteToken", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_RefreshTokens(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "AppCloudServices.IVK_RefreshTokens", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void onFirstLoginAppCloudUser(IContext context, appcloudservices.proxies.UserProfile _userProfile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("UserProfile", _userProfile == null ? null : _userProfile.getMendixObject());
			Core.execute(context, "AppCloudServices.OnFirstLoginAppCloudUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean provisionAsAppCloudUser(IContext context, system.proxies.User _userAccount, java.lang.String _userIdentity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("UserAccount", _userAccount == null ? null : _userAccount.getMendixObject());
			params.put("UserIdentity", _userIdentity);
			return (java.lang.Boolean)Core.execute(context, "AppCloudServices.ProvisionAsAppCloudUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static appcloudservices.proxies.Response refreshTokens(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "AppCloudServices.RefreshTokens", params);
			return result == null ? null : appcloudservices.proxies.Response.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void refreshUserPermissions(IContext context, java.lang.String _openId)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("OpenId", _openId);
			Core.execute(context, "AppCloudServices.RefreshUserPermissions", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void refreshUserRoles(IContext context, system.proxies.User _user, java.lang.String _openId)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("User", _user == null ? null : _user.getMendixObject());
			params.put("OpenId", _openId);
			Core.execute(context, "AppCloudServices.RefreshUserRoles", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean retrieveUserRoles(IContext context, system.proxies.User _user)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("User", _user == null ? null : _user.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "AppCloudServices.RetrieveUserRoles", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sE_DeleteExpiredTokens(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "AppCloudServices.SE_DeleteExpiredTokens", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean startAppCloudServices(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "AppCloudServices.StartAppCloudServices", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static appcloudservices.proxies.DecryptedToken sUB_DecryptToken(IContext context, appcloudservices.proxies.Token _token)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Token", _token == null ? null : _token.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "AppCloudServices.SUB_DecryptToken", params);
			return result == null ? null : appcloudservices.proxies.DecryptedToken.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static appcloudservices.proxies.DecryptedToken sUB_GetDecryptedTokenByTypeForCurrentSession(IContext context, appcloudservices.proxies.TokenType _tokenType)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TokenType", _tokenType == null ? null : _tokenType.name());
			IMendixObject result = (IMendixObject)Core.execute(context, "AppCloudServices.SUB_GetDecryptedTokenByTypeForCurrentSession", params);
			return result == null ? null : appcloudservices.proxies.DecryptedToken.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static appcloudservices.proxies.Token sUB_GetTokenByTypeForCurrentSession(IContext context, appcloudservices.proxies.TokenType _tokenType)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TokenType", _tokenType == null ? null : _tokenType.name());
			IMendixObject result = (IMendixObject)Core.execute(context, "AppCloudServices.SUB_GetTokenByTypeForCurrentSession", params);
			return result == null ? null : appcloudservices.proxies.Token.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static appcloudservices.proxies.Response sUB_RefreshTokens(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "AppCloudServices.SUB_RefreshTokens", params);
			return result == null ? null : appcloudservices.proxies.Response.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_ReplaceRenewedToken(IContext context, java.lang.String _tokenValue, appcloudservices.proxies.TokenType _tokenType)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TokenValue", _tokenValue);
			params.put("TokenType", _tokenType == null ? null : _tokenType.name());
			Core.execute(context, "AppCloudServices.SUB_ReplaceRenewedToken", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static appcloudservices.proxies.AppCloudUser updateAppCloudUser(IContext context, appcloudservices.proxies.UserProfile _userProfile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("UserProfile", _userProfile == null ? null : _userProfile.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "AppCloudServices.UpdateAppCloudUser", params);
			return result == null ? null : appcloudservices.proxies.AppCloudUser.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}